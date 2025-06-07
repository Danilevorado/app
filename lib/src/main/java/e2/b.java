package e2;

import android.graphics.Bitmap;
import q1.a;

/* loaded from: classes.dex */
public final class b implements a.InterfaceC0177a {

    /* renamed from: a, reason: collision with root package name */
    private final u1.d f23024a;

    /* renamed from: b, reason: collision with root package name */
    private final u1.b f23025b;

    public b(u1.d dVar, u1.b bVar) {
        this.f23024a = dVar;
        this.f23025b = bVar;
    }

    @Override // q1.a.InterfaceC0177a
    public Bitmap a(int i10, int i11, Bitmap.Config config) {
        return this.f23024a.e(i10, i11, config);
    }

    @Override // q1.a.InterfaceC0177a
    public void b(byte[] bArr) {
        u1.b bVar = this.f23025b;
        if (bVar == null) {
            return;
        }
        bVar.d(bArr);
    }

    @Override // q1.a.InterfaceC0177a
    public byte[] c(int i10) {
        u1.b bVar = this.f23025b;
        return bVar == null ? new byte[i10] : (byte[]) bVar.e(i10, byte[].class);
    }

    @Override // q1.a.InterfaceC0177a
    public void d(int[] iArr) {
        u1.b bVar = this.f23025b;
        if (bVar == null) {
            return;
        }
        bVar.d(iArr);
    }

    @Override // q1.a.InterfaceC0177a
    public int[] e(int i10) {
        u1.b bVar = this.f23025b;
        return bVar == null ? new int[i10] : (int[]) bVar.e(i10, int[].class);
    }

    @Override // q1.a.InterfaceC0177a
    public void f(Bitmap bitmap) {
        this.f23024a.d(bitmap);
    }
}
