package androidx.activity.result;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: m, reason: collision with root package name */
    private final IntentSender f400m;

    /* renamed from: n, reason: collision with root package name */
    private final Intent f401n;

    /* renamed from: o, reason: collision with root package name */
    private final int f402o;

    /* renamed from: p, reason: collision with root package name */
    private final int f403p;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private IntentSender f404a;

        /* renamed from: b, reason: collision with root package name */
        private Intent f405b;

        /* renamed from: c, reason: collision with root package name */
        private int f406c;

        /* renamed from: d, reason: collision with root package name */
        private int f407d;

        public b(PendingIntent pendingIntent) {
            this(pendingIntent.getIntentSender());
        }

        public b(IntentSender intentSender) {
            this.f404a = intentSender;
        }

        public e a() {
            return new e(this.f404a, this.f405b, this.f406c, this.f407d);
        }

        public b b(Intent intent) {
            this.f405b = intent;
            return this;
        }

        public b c(int i10, int i11) {
            this.f407d = i10;
            this.f406c = i11;
            return this;
        }
    }

    e(IntentSender intentSender, Intent intent, int i10, int i11) {
        this.f400m = intentSender;
        this.f401n = intent;
        this.f402o = i10;
        this.f403p = i11;
    }

    e(Parcel parcel) {
        this.f400m = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f401n = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f402o = parcel.readInt();
        this.f403p = parcel.readInt();
    }

    public Intent a() {
        return this.f401n;
    }

    public int b() {
        return this.f402o;
    }

    public int c() {
        return this.f403p;
    }

    public IntentSender d() {
        return this.f400m;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f400m, i10);
        parcel.writeParcelable(this.f401n, i10);
        parcel.writeInt(this.f402o);
        parcel.writeInt(this.f403p);
    }
}
