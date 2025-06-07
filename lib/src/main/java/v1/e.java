package v1;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p1.a;
import v1.a;

/* loaded from: classes.dex */
public class e implements a {

    /* renamed from: b, reason: collision with root package name */
    private final File f27821b;

    /* renamed from: c, reason: collision with root package name */
    private final long f27822c;

    /* renamed from: e, reason: collision with root package name */
    private p1.a f27824e;

    /* renamed from: d, reason: collision with root package name */
    private final c f27823d = new c();

    /* renamed from: a, reason: collision with root package name */
    private final j f27820a = new j();

    protected e(File file, long j10) {
        this.f27821b = file;
        this.f27822c = j10;
    }

    public static a c(File file, long j10) {
        return new e(file, j10);
    }

    private synchronized p1.a d() {
        if (this.f27824e == null) {
            this.f27824e = p1.a.e0(this.f27821b, 1, 1, this.f27822c);
        }
        return this.f27824e;
    }

    @Override // v1.a
    public void a(r1.f fVar, a.b bVar) {
        p1.a aVarD;
        String strB = this.f27820a.b(fVar);
        this.f27823d.a(strB);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strB + " for for Key: " + fVar);
            }
            try {
                aVarD = d();
            } catch (IOException e5) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e5);
                }
            }
            if (aVarD.c0(strB) != null) {
                return;
            }
            a.c cVarZ = aVarD.Z(strB);
            if (cVarZ == null) {
                throw new IllegalStateException("Had two simultaneous puts for: " + strB);
            }
            try {
                if (bVar.a(cVarZ.f(0))) {
                    cVarZ.e();
                }
                cVarZ.b();
            } catch (Throwable th) {
                cVarZ.b();
                throw th;
            }
        } finally {
            this.f27823d.b(strB);
        }
    }

    @Override // v1.a
    public File b(r1.f fVar) {
        String strB = this.f27820a.b(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strB + " for for Key: " + fVar);
        }
        try {
            a.e eVarC0 = d().c0(strB);
            if (eVarC0 != null) {
                return eVarC0.a(0);
            }
            return null;
        } catch (IOException e5) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e5);
            return null;
        }
    }
}
