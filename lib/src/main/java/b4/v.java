package b4;

import android.os.RemoteException;
import android.util.Log;
import e4.p0;
import e4.r1;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes.dex */
abstract class v extends r1 {

    /* renamed from: m, reason: collision with root package name */
    private final int f4446m;

    protected v(byte[] bArr) {
        e4.p.a(bArr.length == 25);
        this.f4446m = Arrays.hashCode(bArr);
    }

    protected static byte[] L0(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e5) {
            throw new AssertionError(e5);
        }
    }

    @Override // e4.p0
    public final int d() {
        return this.f4446m;
    }

    public final boolean equals(Object obj) {
        l4.a aVarF;
        if (obj != null && (obj instanceof p0)) {
            try {
                p0 p0Var = (p0) obj;
                if (p0Var.d() == this.f4446m && (aVarF = p0Var.f()) != null) {
                    return Arrays.equals(p1(), (byte[]) l4.b.L0(aVarF));
                }
                return false;
            } catch (RemoteException e5) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e5);
            }
        }
        return false;
    }

    @Override // e4.p0
    public final l4.a f() {
        return l4.b.p1(p1());
    }

    public final int hashCode() {
        return this.f4446m;
    }

    abstract byte[] p1();
}
