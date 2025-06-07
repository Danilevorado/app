package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: m, reason: collision with root package name */
    final int f306m;

    /* renamed from: n, reason: collision with root package name */
    final long f307n;

    /* renamed from: o, reason: collision with root package name */
    final long f308o;

    /* renamed from: p, reason: collision with root package name */
    final float f309p;

    /* renamed from: q, reason: collision with root package name */
    final long f310q;

    /* renamed from: r, reason: collision with root package name */
    final int f311r;

    /* renamed from: s, reason: collision with root package name */
    final CharSequence f312s;

    /* renamed from: t, reason: collision with root package name */
    final long f313t;

    /* renamed from: u, reason: collision with root package name */
    List f314u;

    /* renamed from: v, reason: collision with root package name */
    final long f315v;

    /* renamed from: w, reason: collision with root package name */
    final Bundle f316w;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: m, reason: collision with root package name */
        private final String f317m;

        /* renamed from: n, reason: collision with root package name */
        private final CharSequence f318n;

        /* renamed from: o, reason: collision with root package name */
        private final int f319o;

        /* renamed from: p, reason: collision with root package name */
        private final Bundle f320p;

        static class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        CustomAction(Parcel parcel) {
            this.f317m = parcel.readString();
            this.f318n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f319o = parcel.readInt();
            this.f320p = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f318n) + ", mIcon=" + this.f319o + ", mExtras=" + this.f320p;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f317m);
            TextUtils.writeToParcel(this.f318n, parcel, i10);
            parcel.writeInt(this.f319o);
            parcel.writeBundle(this.f320p);
        }
    }

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f306m = parcel.readInt();
        this.f307n = parcel.readLong();
        this.f309p = parcel.readFloat();
        this.f313t = parcel.readLong();
        this.f308o = parcel.readLong();
        this.f310q = parcel.readLong();
        this.f312s = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f314u = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f315v = parcel.readLong();
        this.f316w = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f311r = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f306m + ", position=" + this.f307n + ", buffered position=" + this.f308o + ", speed=" + this.f309p + ", updated=" + this.f313t + ", actions=" + this.f310q + ", error code=" + this.f311r + ", error message=" + this.f312s + ", custom actions=" + this.f314u + ", active item id=" + this.f315v + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f306m);
        parcel.writeLong(this.f307n);
        parcel.writeFloat(this.f309p);
        parcel.writeLong(this.f313t);
        parcel.writeLong(this.f308o);
        parcel.writeLong(this.f310q);
        TextUtils.writeToParcel(this.f312s, parcel, i10);
        parcel.writeTypedList(this.f314u);
        parcel.writeLong(this.f315v);
        parcel.writeBundle(this.f316w);
        parcel.writeInt(this.f311r);
    }
}
