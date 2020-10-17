package ex2_swissmilitary.handler;

import ex2_swissmilitary.request.PermissionRequest;

public class CompanyLeaderPermissionRequest extends PermissionPower {
    private final double ALLOWABLE = 20 * base;

    @Override
    public void processRequest(PermissionRequest request) {
        if(request.getDays() < ALLOWABLE) {
            System.out.println("Company leader will approve permission \""+request.getPurpose()+"\" for "+request.getDays()+" days");
        } else {
            if(successor != null) {
                successor.processRequest(request);
            }
        }
    }
}
