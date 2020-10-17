package ch.hevs.design_patterns.lab12_proxy_pattern_ex1;

public class ImageHighResolution implements Image {

    private String imageFilePath;

    public ImageHighResolution(String imageFilePath) {
        this.imageFilePath = imageFilePath;
        loadImage(imageFilePath);
    }

    private void loadImage(String imageFilePath) {
        // load Image from disk into memory
        // this is heavy and costly operation
        System.out.println("Image " + imageFilePath + " is loaded in full resolution.");
    }

    @Override
    public void showImage(User user) {
        System.out.println("Image " + imageFilePath + " is shown in full resolution for user " + user.getName());
    }

}
