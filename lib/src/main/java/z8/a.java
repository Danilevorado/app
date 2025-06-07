package z8;

import k9.h;

/* loaded from: classes2.dex */
public class a {
    public void a(c cVar, b bVar) {
        try {
            String strA = cVar.a();
            char c10 = 65535;
            if (strA.hashCode() == 1775963278 && strA.equals("pushStat")) {
                c10 = 0;
            }
            qa.b bVar2 = c10 != 0 ? null : new qa.b();
            if (bVar2 == null) {
                return;
            }
            bVar2.a(bVar);
        } catch (ClassCastException unused) {
            h.l("Command", "Can't cast command");
        }
    }
}
