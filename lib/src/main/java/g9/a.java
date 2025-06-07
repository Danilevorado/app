package g9;

import android.content.res.AssetManager;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.TypedValue;
import java.io.IOException;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Locale;
import k9.h;
import ka.e;
import n7.l;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f23898a = {".mp3", ".3gp", ".mp4", ".m4a", ".aac", ".flac", ".ogg", ".wav"};

    private static boolean a(String str) {
        for (String str2 : f23898a) {
            if (str.toLowerCase(Locale.US).endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(String.format("Please set the %1$s constant and recompile the app.", str));
        }
    }

    public static void c(String str, String str2) {
        b(str, str2);
        if (str.length() == 0) {
            throw new IllegalArgumentException(String.format("Please set the %1$s constant and recompile the app.", str2));
        }
    }

    public static int d() {
        return c9.a.a().b();
    }

    public static ArrayList e() throws SecurityException, IOException {
        AssetManager assetManagerC;
        ArrayList arrayList = new ArrayList();
        try {
            Field[] fields = Class.forName(c9.a.a().d() + ".R$raw").getFields();
            int length = fields.length;
            for (int i10 = 0; i10 < length; i10++) {
                String name = fields[i10].getName();
                int iB = c9.a.j().b(name, "raw");
                TypedValue typedValue = new TypedValue();
                c9.a.j().c(iB, typedValue, true);
                if (a(typedValue.string.toString())) {
                    arrayList.add(name);
                }
            }
        } catch (Exception unused) {
        }
        try {
            assetManagerC = c9.a.e().c();
        } catch (IOException e5) {
            h.o(e5);
        } catch (Exception unused2) {
        }
        if (assetManagerC == null) {
            return arrayList;
        }
        for (String str : assetManagerC.list("www/res")) {
            if (assetManagerC.list("www/res/" + str).length == 0 && a(str)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static String f() {
        String strX = l.i().e().x();
        return (strX == null || strX.isEmpty()) ? e.f().r().a() : strX;
    }

    public static boolean g() {
        ConnectivityManager connectivityManagerA = c9.a.e().a();
        NetworkInfo activeNetworkInfo = connectivityManagerA == null ? null : connectivityManagerA.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected();
    }

    public static String h(String str) throws NoSuchAlgorithmException {
        if (str == null) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                sb2.append(String.format("%02x", Byte.valueOf(b10)));
            }
            return sb2.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static int i(String str) {
        try {
            if (!str.startsWith("#") || (str.length() != 7 && str.length() != 9)) {
                if (str.startsWith("#") && str.length() == 4) {
                    char[] charArray = str.toCharArray();
                    str = "#" + charArray[1] + charArray[1] + charArray[2] + charArray[2] + charArray[3] + charArray[3];
                } else {
                    if (!str.startsWith("#") || str.length() != 5) {
                        String[] strArrSplit = str.split(",");
                        return Color.argb(Integer.parseInt(strArrSplit[3]), Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]));
                    }
                    char[] charArray2 = str.toCharArray();
                    str = "#" + charArray2[1] + charArray2[1] + charArray2[2] + charArray2[2] + charArray2[3] + charArray2[3] + charArray2[4] + charArray2[4];
                }
            }
            return Color.parseColor(str);
        } catch (Exception e5) {
            h.o(e5);
            return -1;
        }
    }
}
