package ex2_swissmilitary;

import ex2_swissmilitary.handler.CompanyLeaderPermissionRequest;
import ex2_swissmilitary.handler.PlatoonLeaderPermissionRequest;
import ex2_swissmilitary.handler.SquadLeaderPermissionPower;
import ex2_swissmilitary.request.PermissionRequest;
    
public class CheckPermissions {
    public static void main(String[] args) {
        PermissionRequest request1 = new PermissionRequest(0.5, "congé");
        PermissionRequest request2 = new PermissionRequest(15, "vacances aux Maldives");
        SquadLeaderPermissionPower squadLeader = new SquadLeaderPermissionPower();
        PlatoonLeaderPermissionRequest platoonLeader = new PlatoonLeaderPermissionRequest();
        CompanyLeaderPermissionRequest companyLeader = new CompanyLeaderPermissionRequest();
        squadLeader.setSuccessor(platoonLeader);
        platoonLeader.setSuccessor(companyLeader);

        squadLeader.processRequest(request1);
        squadLeader.processRequest(request2);
    }
}
