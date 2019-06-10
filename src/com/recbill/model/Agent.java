package com.recbill.model;

public class Agent {

    private int agentID;
    private String agentName;
    private String agentSurname;
    private String agentPosition;
    private String agentCompany;

    public Agent(int agentID, String agentName, String agentSurname,
                 String agentPosition, String agentCompany) {
        this.agentID = agentID;
        this.agentName = agentName;
        this.agentSurname = agentSurname;
        this.agentPosition = agentPosition;
        this.agentCompany = agentCompany;
    }

    public Agent(String agentName, String agentSurname, String agentPosition, String agentCompany) {
        this.agentName = agentName;
        this.agentSurname = agentSurname;
        this.agentPosition = agentPosition;
        this.agentCompany = agentCompany;
    }

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public String getAgentSurname() {
        return agentSurname;
    }

    public void setAgentSurname(String agentSurname) {
        this.agentSurname = agentSurname;
    }

    public String getAgentPosition() {
        return agentPosition;
    }

    public void setAgentPosition(String agentPosition) {
        this.agentPosition = agentPosition;
    }

    public String getAgentCompany() {
        return agentCompany;
    }

    public void setAgentCompany(String agentCompany) {
        this.agentCompany = agentCompany;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "agentID=" + agentID +
                ", agentName='" + agentName + '\'' +
                ", agentSurname='" + agentSurname + '\'' +
                ", agentPosition='" + agentPosition + '\'' +
                ", agentCompany='" + agentCompany + '\'' +
                '}';
    }
}
