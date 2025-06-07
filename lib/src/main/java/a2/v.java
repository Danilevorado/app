package a2;

import android.os.Build;
import android.os.ParcelFileDescriptor;

/* loaded from: classes.dex */
public final class v implements r1.j {

    /* renamed from: a, reason: collision with root package name */
    private final m f85a;

    public v(m mVar) {
        this.f85a = mVar;
    }

    private boolean e(ParcelFileDescriptor parcelFileDescriptor) {
        String str = Build.MANUFACTURER;
        return !("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912;
    }

    @Override // r1.j
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public t1.v a(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, r1.h hVar) {
        return this.f85a.e(parcelFileDescriptor, i10, i11, hVar);
    }

    @Override // r1.j
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(ParcelFileDescriptor parcelFileDescriptor, r1.h hVar) {
        return e(parcelFileDescriptor) && this.f85a.o(parcelFileDescriptor);
    }
}
