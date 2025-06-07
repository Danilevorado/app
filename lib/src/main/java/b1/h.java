package b1;

import java.util.List;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4350a = j.i("InputMerger");

    public static h a(String str) {
        try {
            return (h) Class.forName(str).newInstance();
        } catch (Exception e5) {
            j.e().d(f4350a, "Trouble instantiating + " + str, e5);
            return null;
        }
    }

    public abstract androidx.work.b b(List list);
}
