package z7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.AudioManager;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import com.facebook.ads.AdError;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import n7.l;

/* loaded from: classes2.dex */
public abstract class f {

    enum a {
        sound,
        image
    }

    private static float a(int i10, int i11, int i12) {
        DisplayMetrics displayMetricsA;
        int iMax = Math.max(i11, i12);
        if (-1 == i10 || (displayMetricsA = c9.a.j().a()) == null) {
            return 1.0f;
        }
        return iMax / (i10 * displayMetricsA.density);
    }

    public static Bitmap b(String str, int i10) {
        return m(str) ? k(str, i10) : h(e(str), i10);
    }

    private static Uri c(File file) {
        Context contextB = c9.a.b();
        if (contextB == null) {
            return Uri.fromFile(file);
        }
        Uri uriF = androidx.core.content.b.f(contextB, contextB.getPackageName() + ".provider", file);
        contextB.grantUriPermission("com.android.systemui", uriF, 1);
        return uriF;
    }

    private static Uri d(String str, a aVar) {
        String str2;
        String strSubstring = str.substring(str.lastIndexOf(47) + 1);
        File fileC = c9.a.a().c();
        if (fileC == null) {
            str2 = "Missing external cache dir";
        } else {
            String str3 = fileC.toString() + "/com.pushwoosh.noitfysnd";
            File file = new File(str3, strSubstring);
            File file2 = new File(str3);
            if (file2.exists() || file2.mkdir()) {
                AssetManager assetManagerC = c9.a.e().c();
                if (assetManagerC == null) {
                    return Uri.EMPTY;
                }
                try {
                    InputStream inputStreamOpen = assetManagerC.open(str);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        f(inputStreamOpen, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        if (aVar == a.sound) {
                            Uri uriC = c(file);
                            if (inputStreamOpen != null) {
                                inputStreamOpen.close();
                            }
                            return uriC;
                        }
                        Uri uriFromFile = Uri.fromFile(file);
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                        return uriFromFile;
                    } finally {
                    }
                } catch (Throwable th) {
                    k9.h.l("Asset", "File not found: assets/" + str);
                    k9.h.o(th);
                }
            } else {
                str2 = "Storage file not created";
            }
        }
        k9.h.l("Asset", str2);
        return Uri.EMPTY;
    }

    public static String e(String str) {
        return d(str, a.image).getEncodedPath();
    }

    private static void f(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }

    private static void g(URLConnection uRLConnection) {
        if (ka.e.d() != null && ka.e.d().d().a()) {
            return;
        }
        uRLConnection.setConnectTimeout(AdError.SERVER_ERROR_CODE);
    }

    public static Bitmap h(String str, int i10) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(str, options);
        options.inJustDecodeBounds = false;
        options.inSampleSize = Math.round(a(i10, options.outWidth, options.outHeight));
        return BitmapFactory.decodeFile(str, options);
    }

    public static Uri i(String str) {
        ka.h hVarD = ka.e.d();
        Uri defaultUri = RingtoneManager.getDefaultUri(2);
        AudioManager audioManagerH = c9.a.e().h();
        if (audioManagerH != null) {
            if (hVarD.v().a() != w9.i.ALWAYS && (audioManagerH.getRingerMode() != 2 || hVarD.v().a() != w9.i.DEFAULT_MODE)) {
                return null;
            }
            if (str == null || str.equals("default")) {
                return defaultUri;
            }
            if (str.length() == 0) {
                return null;
            }
        }
        int iB = c9.a.j().b(str, "raw");
        if (iB == 0) {
            Uri uriD = d("www/res/" + str, a.sound);
            return uriD != Uri.EMPTY ? uriD : defaultUri;
        }
        return Uri.parse("android.resource://" + c9.a.a().d() + "/" + iB);
    }

    public static boolean j() {
        PackageManager packageManagerG = c9.a.e().g();
        if (packageManagerG == null) {
            return false;
        }
        try {
        } catch (Exception e5) {
            k9.h.n("error in checking vibrate permission", e5);
        }
        return packageManagerG.checkPermission("android.permission.VIBRATE", c9.a.a().d()) == 0;
    }

    public static Bitmap k(String str, int i10) {
        if (str == null) {
            return null;
        }
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            g(uRLConnectionOpenConnection);
            uRLConnectionOpenConnection.connect();
            byte[] bArr = new byte[1024];
            InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        int i11 = inputStream.read(bArr);
                        if (i11 == -1) {
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            inputStream.close();
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
                            float fA = a(i10, options.outWidth, options.outHeight);
                            options.inJustDecodeBounds = false;
                            options.inSampleSize = Math.round(fA);
                            return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
                        }
                        byteArrayOutputStream.write(bArr, 0, i11);
                    } finally {
                        byteArrayOutputStream.close();
                    }
                }
            } catch (Throwable th) {
                inputStream.close();
                throw th;
            }
        } catch (Throwable th2) {
            k9.h.n("Can't load image: " + str, th2);
            return null;
        }
    }

    public static void l() {
        PowerManager powerManagerB;
        try {
            if (!ka.e.d().l().a() || (powerManagerB = c9.a.e().b()) == null) {
                return;
            }
            powerManagerB.newWakeLock(268435466, "Push").acquire(1000L);
        } catch (Exception e5) {
            k9.h.o(e5);
        }
    }

    public static boolean m(String str) throws URISyntaxException {
        try {
            new URL(str).toURI();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static int n(String str) {
        int iB;
        int iR;
        int iB2 = c9.a.j().b("pw_notification", "drawable");
        if (iB2 == 0) {
            iB2 = -1;
        }
        if (l.i() != null && l.i().e() != null && (iR = l.i().e().r()) != 0) {
            iB2 = iR;
        }
        return (str == null || (iB = c9.a.j().b(str, "drawable")) == 0) ? iB2 : iB;
    }
}
