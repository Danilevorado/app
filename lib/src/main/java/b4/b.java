package b4;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.internal.api.AdSizeApi;
import e4.o;

/* loaded from: classes.dex */
public final class b extends f4.a {

    /* renamed from: m, reason: collision with root package name */
    final int f4400m;

    /* renamed from: n, reason: collision with root package name */
    private final int f4401n;

    /* renamed from: o, reason: collision with root package name */
    private final PendingIntent f4402o;

    /* renamed from: p, reason: collision with root package name */
    private final String f4403p;

    /* renamed from: q, reason: collision with root package name */
    public static final b f4399q = new b(0);
    public static final Parcelable.Creator<b> CREATOR = new n();

    public b(int i10) {
        this(i10, null, null);
    }

    b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f4400m = i10;
        this.f4401n = i11;
        this.f4402o = pendingIntent;
        this.f4403p = str;
    }

    public b(int i10, PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public b(int i10, PendingIntent pendingIntent, String str) {
        this(1, i10, pendingIntent, str);
    }

    static String z(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case AdSizeApi.RECTANGLE_HEIGHT_250 /* 7 */:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case NativeAdScrollView.DEFAULT_MAX_ADS /* 10 */:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case NativeAdScrollView.DEFAULT_INSET /* 20 */:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i10 + ")";
                }
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4401n == bVar.f4401n && e4.o.a(this.f4402o, bVar.f4402o) && e4.o.a(this.f4403p, bVar.f4403p);
    }

    public int f() {
        return this.f4401n;
    }

    public String h() {
        return this.f4403p;
    }

    public int hashCode() {
        return e4.o.b(Integer.valueOf(this.f4401n), this.f4402o, this.f4403p);
    }

    public String toString() {
        o.a aVarC = e4.o.c(this);
        aVarC.a("statusCode", z(this.f4401n));
        aVarC.a("resolution", this.f4402o);
        aVarC.a("message", this.f4403p);
        return aVarC.toString();
    }

    public PendingIntent v() {
        return this.f4402o;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f4400m;
        int iA = f4.c.a(parcel);
        f4.c.k(parcel, 1, i11);
        f4.c.k(parcel, 2, f());
        f4.c.p(parcel, 3, v(), i10, false);
        f4.c.q(parcel, 4, h(), false);
        f4.c.b(parcel, iA);
    }

    public boolean x() {
        return (this.f4401n == 0 || this.f4402o == null) ? false : true;
    }

    public boolean y() {
        return this.f4401n == 0;
    }
}
