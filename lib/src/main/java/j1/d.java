package j1;

import b1.j;
import g1.a0;
import g1.i;
import g1.o;
import g1.v;
import g1.y;
import ib.r;
import java.util.Iterator;
import java.util.List;
import rb.h;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f24382a;

    static {
        String strI = j.i("DiagnosticsWrkr");
        h.d(strI, "tagWithPrefix(\"DiagnosticsWrkr\")");
        f24382a = strI;
    }

    private static final String c(v vVar, String str, Integer num, String str2) {
        return '\n' + vVar.f23739a + "\t " + vVar.f23741c + "\t " + num + "\t " + vVar.f23740b.name() + "\t " + str + "\t " + str2 + '\t';
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(o oVar, a0 a0Var, g1.j jVar, List list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            i iVarG = jVar.g(y.a(vVar));
            sb2.append(c(vVar, r.l(oVar.b(vVar.f23739a), ",", null, null, 0, null, null, 62, null), iVarG != null ? Integer.valueOf(iVarG.f23711c) : null, r.l(a0Var.c(vVar.f23739a), ",", null, null, 0, null, null, 62, null)));
        }
        String string = sb2.toString();
        h.d(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
