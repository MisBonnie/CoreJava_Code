package com.zzxx.i_waitAndNotify;

public class Demo {
    public static void main(String[] args) {
        Picture picture = new Picture();
        LoadPicture load = new LoadPicture(picture);
        ShowPicture show = new ShowPicture(picture);

        load.start();
        show.start();
    }
}
