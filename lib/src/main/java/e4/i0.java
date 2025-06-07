package e4;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    private final SparseIntArray f23167a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    private b4.f f23168b;

    public i0(b4.f fVar) {
        p.l(fVar);
        this.f23168b = fVar;
    }

    public final int a(Context context, int i10) {
        return this.f23167a.get(i10, -1);
    }

    public final int b(Context context, a.f fVar) {
        p.l(context);
        p.l(fVar);
        int i10 = 0;
        if (!fVar.g()) {
            return 0;
        }
        int iH = fVar.h();
        int iA = a(context, iH);
        if (iA == -1) {
            int i11 = 0;
            while (true) {
                if (i11 >= this.f23167a.size()) {
                    i10 = -1;
                    break;
                }
                int iKeyAt = this.f23167a.keyAt(i11);
                if (iKeyAt > iH && this.f23167a.get(iKeyAt) == 0) {
                    break;
                }
                i11++;
            }
            iA = i10 == -1 ? this.f23168b.j(context, iH) : i10;
            this.f23167a.put(iH, iA);
        }
        return iA;
    }

    public final void c() {
        this.f23167a.clear();
    }
}
