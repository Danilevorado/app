package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(androidx.versionedparcelable.a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f2216a = aVar.p(iconCompat.f2216a, 1);
        iconCompat.f2218c = aVar.j(iconCompat.f2218c, 2);
        iconCompat.f2219d = aVar.r(iconCompat.f2219d, 3);
        iconCompat.f2220e = aVar.p(iconCompat.f2220e, 4);
        iconCompat.f2221f = aVar.p(iconCompat.f2221f, 5);
        iconCompat.f2222g = (ColorStateList) aVar.r(iconCompat.f2222g, 6);
        iconCompat.f2224i = aVar.t(iconCompat.f2224i, 7);
        iconCompat.f2225j = aVar.t(iconCompat.f2225j, 8);
        iconCompat.j();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(true, true);
        iconCompat.k(aVar.f());
        int i10 = iconCompat.f2216a;
        if (-1 != i10) {
            aVar.F(i10, 1);
        }
        byte[] bArr = iconCompat.f2218c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f2219d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i11 = iconCompat.f2220e;
        if (i11 != 0) {
            aVar.F(i11, 4);
        }
        int i12 = iconCompat.f2221f;
        if (i12 != 0) {
            aVar.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f2222g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f2224i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f2225j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
