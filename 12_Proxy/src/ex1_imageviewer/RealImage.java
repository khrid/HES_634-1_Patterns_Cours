package ex1_imageviewer;

public class RealImage implements Image {

    String path;

    public RealImage(String path) {
        this.path = path;
    }

    @Override
    public void showImage(User user) {
        System.out.println("Image "+this.path+" is loaded in full resolution.");
        System.out.println("Image " + this.path+" is shown in full resolution for user " + user.getName()+"");
    }
}
