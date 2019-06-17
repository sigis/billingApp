package com.recbill.controller.servlets;

import com.recbill.controller.dal.InvoiceDal;
import com.recbill.controller.dal.ItemDal;
import com.recbill.model.Invoice;
import com.recbill.model.Item;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.sql.DataSource;
import java.io.IOException;
import java.util.List;

@WebServlet("/invoices")
public class InvoiceServlet extends HttpServlet {

    private InvoiceDal invoiceDal;
    private ItemDal itemDal;

    @Resource(name = "jdbc/recbill")
    private DataSource dataSource;

    @Override
    public void init() throws ServletException {
        super.init();

        // Create invoiceDAL and pass into connection pool/datasource
        try {
            invoiceDal = new InvoiceDal(dataSource);
            itemDal = new ItemDal(dataSource);
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // list invoices ... in MVC fashion
        try {
            listInvoices(request, response);
        } catch (Exception e) {
            throw new ServletException(e);
        }
    }

    private void listInvoices(HttpServletRequest request, HttpServletResponse response) throws Exception {

        // get invoices from invoice data access layer (DAL)
        List<Invoice> invoices = invoiceDal.getInvoices();

        // get items from item data access layer (DAL)
        List<Item> items = itemDal.getItems();

        // add invoices and items to request object
        request.setAttribute("INVOICES", invoices);
        request.setAttribute("ITEMS", items);

        // send invoices to the jsp (view) page
        RequestDispatcher dispatcher = request.getRequestDispatcher("/invoices.jsp");
        dispatcher.forward(request, response);
    }
}
