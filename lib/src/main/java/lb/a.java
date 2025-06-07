package lb;

import java.lang.reflect.Method;
import rb.h;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: lb.a$a, reason: collision with other inner class name */
    private static final class C0161a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0161a f25155a = new C0161a();

        /* renamed from: b, reason: collision with root package name */
        public static final Method f25156b;

        /* renamed from: c, reason: collision with root package name */
        public static final Method f25157c;

        /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
        static {
            /*
                lb.a$a r0 = new lb.a$a
                r0.<init>()
                lb.a.C0161a.f25155a = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableMethods"
                rb.h.d(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = r3
            L15:
                r5 = 0
                if (r4 >= r2) goto L42
                r6 = r1[r4]
                java.lang.String r7 = r6.getName()
                java.lang.String r8 = "addSuppressed"
                boolean r7 = rb.h.a(r7, r8)
                if (r7 == 0) goto L3b
                java.lang.Class[] r7 = r6.getParameterTypes()
                java.lang.String r8 = "it.parameterTypes"
                rb.h.d(r7, r8)
                java.lang.Object r7 = ib.b.g(r7)
                boolean r7 = rb.h.a(r7, r0)
                if (r7 == 0) goto L3b
                r7 = 1
                goto L3c
            L3b:
                r7 = r3
            L3c:
                if (r7 == 0) goto L3f
                goto L43
            L3f:
                int r4 = r4 + 1
                goto L15
            L42:
                r6 = r5
            L43:
                lb.a.C0161a.f25156b = r6
                int r0 = r1.length
            L46:
                if (r3 >= r0) goto L5b
                r2 = r1[r3]
                java.lang.String r4 = r2.getName()
                java.lang.String r6 = "getSuppressed"
                boolean r4 = rb.h.a(r4, r6)
                if (r4 == 0) goto L58
                r5 = r2
                goto L5b
            L58:
                int r3 = r3 + 1
                goto L46
            L5b:
                lb.a.C0161a.f25157c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lb.a.C0161a.<clinit>():void");
        }

        private C0161a() {
        }
    }

    public void a(Throwable th, Throwable th2) {
        h.e(th, "cause");
        h.e(th2, "exception");
        Method method = C0161a.f25156b;
        if (method != null) {
            method.invoke(th, th2);
        }
    }

    public sb.c b() {
        return new sb.b();
    }
}
