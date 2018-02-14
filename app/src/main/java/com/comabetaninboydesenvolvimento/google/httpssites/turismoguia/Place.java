package com.comabetaninboydesenvolvimento.google.httpssites.turismoguia;

/**
 * Created by lucas on 26/01/2018.
 */

class Place {

    private final int mPlaceName;
    private final int mDescription;
    private final int mPrice;
    private final int mLikes;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    Place(int placeName, int description, int price, int likes, int imageResourceId) {
        mPlaceName = placeName;
        mDescription = description;
        mPrice = price;
        mLikes = likes;
        mImageResourceId = imageResourceId;

    }

    public int getPlaceName() {
        return mPlaceName;
    }

    public int getDescription() {
        return mDescription;
    }

    public int getPrice() {
        return mPrice;
    }

    public int getLikes() {
        return mLikes;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}