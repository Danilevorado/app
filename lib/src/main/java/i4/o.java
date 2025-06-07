package i4;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    private static String f24315a;

    /* renamed from: b, reason: collision with root package name */
    private static int f24316b;

    public static String a() throws Throwable {
        BufferedReader bufferedReader;
        String str;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads;
        if (f24315a == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                f24315a = Application.getProcessName();
            } else {
                int iMyPid = f24316b;
                if (iMyPid == 0) {
                    iMyPid = Process.myPid();
                    f24316b = iMyPid;
                }
                String strTrim = null;
                strTrim = null;
                strTrim = null;
                BufferedReader bufferedReader2 = null;
                if (iMyPid > 0) {
                    try {
                        str = "/proc/" + iMyPid + "/cmdline";
                        threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    } catch (IOException unused) {
                        bufferedReader = null;
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        bufferedReader = new BufferedReader(new FileReader(str));
                        try {
                            String line = bufferedReader.readLine();
                            e4.p.l(line);
                            strTrim = line.trim();
                        } catch (IOException unused2) {
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader2 = bufferedReader;
                            k.a(bufferedReader2);
                            throw th;
                        }
                        k.a(bufferedReader);
                    } finally {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    }
                }
                f24315a = strTrim;
            }
        }
        return f24315a;
    }
}
