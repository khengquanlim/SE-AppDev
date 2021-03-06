package com.cz2006.fitflop.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.common.cache.Weigher;

public class User implements Parcelable{

    private String email;
    private String user_id;
    private String username;
    private String avatar;

    private float height;
    private float weight;
    private boolean isHeightWeightInitialized;

    public User(String email, String user_id, String username, String avatar) {
        this.email = email;
        this.user_id = user_id;
        this.username = username;
        this.avatar = avatar;

        this.height = 0.0f;
        this.weight = 0.0f;
        this.isHeightWeightInitialized = false;
    }

    public User(String email, String user_id, String username, String avatar, float height, float weight) {
        this.email = email;
        this.user_id = user_id;
        this.username = username;
        this.avatar = avatar;

        this.height = height;
        this.weight = weight;
        this.isHeightWeightInitialized = true;
    }

    public User() {

    }

    protected User(Parcel in) {
        email = in.readString();
        user_id = in.readString();
        username = in.readString();
        avatar = in.readString();
    }

    public static final Creator<User> CREATOR = new Creator<User>() {
        @Override
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public static Creator<User> getCREATOR() {
        return CREATOR;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.height = weight;
    }

    public boolean isHeightWeightInitialized() {
        return isHeightWeightInitialized;
    }

    public void setHeightWeightInitialized(boolean isHeightWeightInitialized) {
        this.isHeightWeightInitialized = isHeightWeightInitialized;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("User{" +
                "email='" + email + '\'' +
                ", user_id='" + user_id + '\'' +
                ", username='" + username + '\'' +
                ", avatar='" + avatar + '\'');
        if (height+weight > 0) str.append(", height='" + height + '\'' +
                                           ", weight='" + weight + '\'');
        str.append('}');
        return str.toString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(email);
        dest.writeString(user_id);
        dest.writeString(username);
        dest.writeString(avatar);
        dest.writeFloat(height);
        dest.writeFloat(weight);
    }
}

