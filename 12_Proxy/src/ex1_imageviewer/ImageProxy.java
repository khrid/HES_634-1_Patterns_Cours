package ex1_imageviewer;

public class ImageProxy implements Image {
    String path;
    private RealImage realImage;

    public ImageProxy(String path) {
        this.path = path;
        System.out.println("Low resolution preview image of file "+path+" is shown.");
    }

    @Override
    public void showImage(User user) {
        System.out.println("\n"+user.getName() + " selects preview image "+this.path+" and wants to see its full resolution.");
        boolean isRegistered = RegistrationService.isRegistered(user);
        if(isRegistered) {
            this.realImage = new RealImage(this.path);
            realImage.showImage(user);
        } else {
            System.out.println("User "+user.getName()+" is not registered and therefore cannot load full resolution of picture "+this.path+"");
        }
    }
}
