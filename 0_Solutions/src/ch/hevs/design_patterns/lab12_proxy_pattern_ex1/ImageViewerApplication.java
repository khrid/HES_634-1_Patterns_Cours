package ch.hevs.design_patterns.lab12_proxy_pattern_ex1;

public class ImageViewerApplication {


    public static void main(String[] args) {

        // Define users
        User jean = new User("Jean");
        User paul = new User("Paul");
        User pierre = new User("Pierre");

        RegistrationService.register(paul);

        //create the 3 images
        Image highResolutionImage1 = new ImageProxy("sample/veryHighResPhoto1.jpeg");
        Image highResolutionImage2 = new ImageProxy("sample/veryHighResPhoto2.jpeg");
        Image highResolutionImage3 = new ImageProxy("sample/veryHighResPhoto3.jpeg");

        // assume that the user clicks on Image one item in a list
        // this would cause the program to call showImage() for that image only
        // note that in this case only image one was loaded into memory
        highResolutionImage1.showImage(jean);
        highResolutionImage2.showImage(paul);
        highResolutionImage3.showImage(pierre);
    }

}