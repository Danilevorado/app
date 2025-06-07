package m9;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final String f25379a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25380b;

    /* renamed from: c, reason: collision with root package name */
    private final q9.b f25381c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f25382d;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    j(org.json.JSONObject r5) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.String r0 = "code"
            java.lang.String r0 = r5.optString(r0)
            r4.f25379a = r0
            java.lang.String r1 = "richmedia"
            java.lang.String r1 = r5.optString(r1)
            r4.f25380b = r1
            java.lang.String r2 = "required"
            r3 = 0
            boolean r5 = r5.optBoolean(r2, r3)
            r4.f25382d = r5
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L2e
            s9.d r5 = y7.b.d()
            if (r5 != 0) goto L29
            goto L46
        L29:
            q9.b r5 = r5.c(r0)
            goto L47
        L2e:
            boolean r5 = r1.isEmpty()
            if (r5 != 0) goto L46
            m9.h r5 = y7.b.c()
            if (r5 == 0) goto L46
            m9.h r5 = y7.b.c()
            r5.g(r1)
            q9.b r5 = r4.b(r1)
            goto L47
        L46:
            r5 = 0
        L47:
            r4.f25381c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.j.<init>(org.json.JSONObject):void");
    }

    private q9.b b(String str) {
        try {
            return q9.b.d(str);
        } catch (p8.a e5) {
            k9.h.n("Failed to parse rich media json", e5);
            return null;
        }
    }

    public String a() {
        return this.f25379a;
    }

    public q9.b c() {
        return this.f25381c;
    }

    public boolean d() {
        return this.f25382d;
    }
}
