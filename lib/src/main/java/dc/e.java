package dc;

import android.os.Build;
import dc.c;

/* loaded from: classes2.dex */
final class e implements c.b {
    e() {
    }

    @Override // dc.c.b
    public String a(String str) {
        return (str.startsWith("lib") && str.endsWith(".so")) ? str : System.mapLibraryName(str);
    }

    @Override // dc.c.b
    public String b(String str) {
        return str.substring(3, str.length() - 3);
    }

    @Override // dc.c.b
    public void c(String str) {
        System.loadLibrary(str);
    }

    @Override // dc.c.b
    public String[] d() {
        String[] strArr = Build.SUPPORTED_ABIS;
        if (strArr.length > 0) {
            return strArr;
        }
        String str = Build.CPU_ABI2;
        return !f.a(str) ? new String[]{Build.CPU_ABI, str} : new String[]{Build.CPU_ABI};
    }

    @Override // dc.c.b
    public void e(String str) {
        System.load(str);
    }
}
