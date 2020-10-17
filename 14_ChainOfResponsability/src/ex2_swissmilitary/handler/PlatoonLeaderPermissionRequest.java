package ex2_swissmilitary.handler;

import ex2_swissmilitary.request.PermissionRequest;

public class PlatoonLeaderPermissionRequest extends PermissionPower{
    private final double ALLOWABLE = 10 * base;

    @Override
    public void processRequest(PermissionRequest request) {
        if(request.getDays() < ALLOWABLE) {
            System.out.println("Platoon leader will approve permission \""+request.getPurpose()+"\" for "+request.getDays()+" days");
        } else {
            if(successor != null) {
                successor.processRequest(request);
            }
        }
    }
}
