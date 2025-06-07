package m3;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f25219a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final List f25220b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private final List f25221c = new ArrayList();

    public final f0 a(String str, double d10, double d11) {
        int i10 = 0;
        while (i10 < this.f25219a.size()) {
            double dDoubleValue = ((Double) this.f25221c.get(i10)).doubleValue();
            double dDoubleValue2 = ((Double) this.f25220b.get(i10)).doubleValue();
            if (d10 < dDoubleValue || (dDoubleValue == d10 && d11 < dDoubleValue2)) {
                break;
            }
            i10++;
        }
        this.f25219a.add(i10, str);
        this.f25221c.add(i10, Double.valueOf(d10));
        this.f25220b.add(i10, Double.valueOf(d11));
        return this;
    }

    public final h0 b() {
        return new h0(this, null);
    }
}
