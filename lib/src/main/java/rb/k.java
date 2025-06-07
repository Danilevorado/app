package rb;

/* loaded from: classes2.dex */
public class k {
    public vb.a a(Class cls) {
        return new d(cls);
    }

    public String b(g gVar) {
        String string = gVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String c(i iVar) {
        return b(iVar);
    }
}
