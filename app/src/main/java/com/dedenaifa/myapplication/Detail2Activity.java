package com.dedenaifa.myapplication;

import androidx.annotation.NonNull;
import android.os.Parcel;
import android.os.Parcelable;

public class Detail2Activity implements Parcelable {
    private String name;
    private String date;
    private String publisher;

    public Detail2Activity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    protected Detail2Activity(Parcel in) {
        name = in.readString();
        date = in.readString();
        publisher = in.readString();
    }

    public static final Creator<Detail2Activity> CREATOR = new Creator<Detail2Activity>() {
        @Override
        public Detail2Activity createFromParcel(Parcel in) {
            return new Detail2Activity(in);
        }

        @Override
        public Detail2Activity[] newArray(int size) {
            return new Detail2Activity[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(date);
        dest.writeString(publisher);
    }
}