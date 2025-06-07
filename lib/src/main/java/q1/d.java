package q1;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes.dex */
public class d {

    /* renamed from: b, reason: collision with root package name */
    private ByteBuffer f26119b;

    /* renamed from: c, reason: collision with root package name */
    private c f26120c;

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f26118a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    private int f26121d = 0;

    private boolean b() {
        return this.f26120c.f26106b != 0;
    }

    private int d() {
        try {
            return this.f26119b.get() & 255;
        } catch (Exception unused) {
            this.f26120c.f26106b = 1;
            return 0;
        }
    }

    private void e() {
        this.f26120c.f26108d.f26094a = n();
        this.f26120c.f26108d.f26095b = n();
        this.f26120c.f26108d.f26096c = n();
        this.f26120c.f26108d.f26097d = n();
        int iD = d();
        boolean z10 = (iD & 128) != 0;
        int iPow = (int) Math.pow(2.0d, (iD & 7) + 1);
        b bVar = this.f26120c.f26108d;
        bVar.f26098e = (iD & 64) != 0;
        if (z10) {
            bVar.f26104k = g(iPow);
        } else {
            bVar.f26104k = null;
        }
        this.f26120c.f26108d.f26103j = this.f26119b.position();
        r();
        if (b()) {
            return;
        }
        c cVar = this.f26120c;
        cVar.f26107c++;
        cVar.f26109e.add(cVar.f26108d);
    }

    private void f() {
        int iD = d();
        this.f26121d = iD;
        if (iD <= 0) {
            return;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            try {
                i11 = this.f26121d;
                if (i10 >= i11) {
                    return;
                }
                i11 -= i10;
                this.f26119b.get(this.f26118a, i10, i11);
                i10 += i11;
            } catch (Exception e5) {
                if (Log.isLoggable("GifHeaderParser", 3)) {
                    Log.d("GifHeaderParser", "Error Reading Block n: " + i10 + " count: " + i11 + " blockSize: " + this.f26121d, e5);
                }
                this.f26120c.f26106b = 1;
                return;
            }
        }
    }

    private int[] g(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f26119b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = i12 + 1;
                int i14 = i13 + 1;
                int i15 = i14 + 1;
                int i16 = i11 + 1;
                iArr[i11] = ((bArr[i12] & 255) << 16) | (-16777216) | ((bArr[i13] & 255) << 8) | (bArr[i14] & 255);
                i12 = i15;
                i11 = i16;
            }
        } catch (BufferUnderflowException e5) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e5);
            }
            this.f26120c.f26106b = 1;
        }
        return iArr;
    }

    private void h() {
        i(Integer.MAX_VALUE);
    }

    private void i(int i10) {
        boolean z10 = false;
        while (!z10 && !b() && this.f26120c.f26107c <= i10) {
            int iD = d();
            if (iD == 33) {
                int iD2 = d();
                if (iD2 != 1) {
                    if (iD2 == 249) {
                        this.f26120c.f26108d = new b();
                        j();
                    } else if (iD2 != 254 && iD2 == 255) {
                        f();
                        StringBuilder sb2 = new StringBuilder();
                        for (int i11 = 0; i11 < 11; i11++) {
                            sb2.append((char) this.f26118a[i11]);
                        }
                        if (sb2.toString().equals("NETSCAPE2.0")) {
                            m();
                        }
                    }
                }
                q();
            } else if (iD == 44) {
                c cVar = this.f26120c;
                if (cVar.f26108d == null) {
                    cVar.f26108d = new b();
                }
                e();
            } else if (iD != 59) {
                this.f26120c.f26106b = 1;
            } else {
                z10 = true;
            }
        }
    }

    private void j() {
        d();
        int iD = d();
        b bVar = this.f26120c.f26108d;
        int i10 = (iD & 28) >> 2;
        bVar.f26100g = i10;
        if (i10 == 0) {
            bVar.f26100g = 1;
        }
        bVar.f26099f = (iD & 1) != 0;
        int iN = n();
        if (iN < 2) {
            iN = 10;
        }
        b bVar2 = this.f26120c.f26108d;
        bVar2.f26102i = iN * 10;
        bVar2.f26101h = d();
        d();
    }

    private void k() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) d());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f26120c.f26106b = 1;
            return;
        }
        l();
        if (!this.f26120c.f26112h || b()) {
            return;
        }
        c cVar = this.f26120c;
        cVar.f26105a = g(cVar.f26113i);
        c cVar2 = this.f26120c;
        cVar2.f26116l = cVar2.f26105a[cVar2.f26114j];
    }

    private void l() {
        this.f26120c.f26110f = n();
        this.f26120c.f26111g = n();
        int iD = d();
        c cVar = this.f26120c;
        cVar.f26112h = (iD & 128) != 0;
        cVar.f26113i = (int) Math.pow(2.0d, (iD & 7) + 1);
        this.f26120c.f26114j = d();
        this.f26120c.f26115k = d();
    }

    private void m() {
        do {
            f();
            byte[] bArr = this.f26118a;
            if (bArr[0] == 1) {
                this.f26120c.f26117m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.f26121d <= 0) {
                return;
            }
        } while (!b());
    }

    private int n() {
        return this.f26119b.getShort();
    }

    private void o() {
        this.f26119b = null;
        Arrays.fill(this.f26118a, (byte) 0);
        this.f26120c = new c();
        this.f26121d = 0;
    }

    private void q() {
        int iD;
        do {
            iD = d();
            this.f26119b.position(Math.min(this.f26119b.position() + iD, this.f26119b.limit()));
        } while (iD > 0);
    }

    private void r() {
        d();
        q();
    }

    public void a() {
        this.f26119b = null;
        this.f26120c = null;
    }

    public c c() {
        if (this.f26119b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        }
        if (b()) {
            return this.f26120c;
        }
        k();
        if (!b()) {
            h();
            c cVar = this.f26120c;
            if (cVar.f26107c < 0) {
                cVar.f26106b = 1;
            }
        }
        return this.f26120c;
    }

    public d p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f26119b = byteBufferAsReadOnlyBuffer;
        byteBufferAsReadOnlyBuffer.position(0);
        this.f26119b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
