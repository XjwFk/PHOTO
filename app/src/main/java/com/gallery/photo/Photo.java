package com.gallery.photo;

import android.os.Parcel;
import android.os.Parcelable;

public class Photo implements Parcelable {

    private String url;

    public Photo(String url) {
        this.url = url;
    }

    protected Photo(Parcel in) {
        url = in.readString();
    }

    public static final Creator<Photo> CREATOR = new Creator<Photo>() {
        @Override
        public Photo createFromParcel(Parcel in) {
            return new Photo(in);
        }

        @Override
        public Photo[] newArray(int size) {
            return new Photo[size];
        }
    };

    public String getUrl() {
        return url;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(url);
    }
}
