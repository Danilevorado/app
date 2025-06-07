package d7;

import java.io.File;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
public abstract class a {
    private static String a(String str) {
        int iLastIndexOf = str.lastIndexOf(File.separatorChar);
        int iC = c(str);
        return iLastIndexOf < iC ? str.substring(iC) : str.substring(iLastIndexOf + 1);
    }

    public static String b(String str) {
        int iLastIndexOf = str.lastIndexOf(File.separatorChar);
        int iC = c(str);
        return iLastIndexOf < iC ? (iC <= 0 || str.length() <= iC) ? "" : str.substring(0, iC) : str.substring(0, iLastIndexOf);
    }

    private static int c(String str) {
        return (str.length() != 0 && str.charAt(0) == '/') ? 1 : 0;
    }

    public static boolean d(String str, a7.a aVar) {
        String strB = b(str);
        if (aVar.r() && a(strB).startsWith(".")) {
            return true;
        }
        if (aVar.a() != null) {
            for (Matcher matcher : aVar.a()) {
                if (matcher.reset(str).matches()) {
                    return true;
                }
            }
        }
        if (aVar.v()) {
            return new File(strB, ".nomedia").exists();
        }
        return false;
    }
}
