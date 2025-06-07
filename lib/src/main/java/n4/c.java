package n4;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    private static final ClassLoader f25517a = c.class.getClassLoader();

    public static void a(Parcel parcel, boolean z10) {
        parcel.writeInt(1);
    }

    public static boolean b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
