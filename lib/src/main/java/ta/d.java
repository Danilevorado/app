package ta;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
class d {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f27396a;

    private static class a extends AsyncTask {

        /* renamed from: a, reason: collision with root package name */
        private final d f27397a;

        public a(d dVar) {
            this.f27397a = dVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Void... voidArr) {
            d dVar = this.f27397a;
            if (dVar == null) {
                return null;
            }
            dVar.d();
            return null;
        }
    }

    public d(Context context) {
        this.f27396a = new WeakReference(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean g(File file, String str) {
        return str.endsWith(g.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean j(File file, String str) {
        return str.endsWith(g.b());
    }

    private Context k() {
        WeakReference weakReference = this.f27396a;
        if (weakReference != null) {
            return (Context) weakReference.get();
        }
        return null;
    }

    private void s() {
        String str;
        try {
            k9.h.g("Sending crashreports to report server.");
            boolean zG = g9.a.g();
            String[] strArrR = r();
            if (strArrR == null || strArrR.length <= 0) {
                str = "No new crashreports were found.";
            } else {
                f(strArrR);
                if (zG) {
                    for (String str2 : strArrR) {
                        e(str2, h());
                    }
                    return;
                }
                str = "No internet connection available. Pushwoosh will try to send crashreports on next app launch.";
            }
            k9.h.g(str);
        } catch (Exception e5) {
            k9.h.g("Exception occurred while sending crash reports:\n" + e5.getMessage());
        }
    }

    String c(String str) throws IOException {
        File fileStreamPath;
        Context contextK = k();
        if (contextK == null || (fileStreamPath = contextK.getFileStreamPath(str)) == null || !fileStreamPath.exists()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(contextK.openFileInput(str)));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                    sb2.append(System.getProperty("line.separator"));
                } finally {
                }
            }
            bufferedReader.close();
        } catch (IOException e5) {
            k9.h.n("Failed to read content of " + str, e5);
        }
        return sb2.toString();
    }

    void d() {
        String str;
        k9.h.g("Looking for stacktraces to send.");
        int iL = l();
        if (iL == 1 || iL == 2) {
            try {
                k9.h.g("Found stacktraces to send.");
                n();
                s();
                return;
            } catch (Exception e5) {
                str = "Exception occurred while executing CrashManager:\n" + e5.getMessage();
            }
        } else {
            str = "No stacktraces were found.";
        }
        k9.h.g(str);
    }

    void e(String str, String str2) {
        k9.h.g("Sending crash report to the server.");
        HttpURLConnection httpURLConnectionA = null;
        try {
            try {
                String strC = c(str);
                if (strC.length() > 0) {
                    httpURLConnectionA = new h(str2).d("POST").c("X-Rollbar-Access-Token", "be99f6c020e64b9e87cbc2e64d1e3592").b(strC).a();
                    k9.h.g("Crash report was submitted: " + httpURLConnectionA.getResponseCode() + " " + httpURLConnectionA.getResponseMessage());
                }
            } catch (Exception e5) {
                k9.h.g("Exception occurred while submitting crash report to the server " + e5.getMessage());
                if (httpURLConnectionA != null) {
                }
            }
            if (httpURLConnectionA != null) {
                httpURLConnectionA.disconnect();
            }
            i(str);
        } catch (Throwable th) {
            if (httpURLConnectionA != null) {
                httpURLConnectionA.disconnect();
            }
            i(str);
            throw th;
        }
    }

    void f(String[] strArr) {
        Context contextK = k();
        if (contextK != null) {
            try {
                SharedPreferences.Editor editorEdit = contextK.getSharedPreferences("SdkCrashAnalytics", 0).edit();
                editorEdit.putString("ConfirmedFilenames", TextUtils.join(",", strArr));
                editorEdit.apply();
            } catch (Exception unused) {
            }
        }
    }

    String h() {
        return "https://api.rollbar.com/api/1/item/";
    }

    void i(String str) {
        Context contextK = k();
        if (contextK != null) {
            contextK.deleteFile(str);
            contextK.deleteFile(str.replace(g.b(), ".user"));
            contextK.deleteFile(str.replace(g.b(), ".contact"));
            contextK.deleteFile(str.replace(g.b(), ".description"));
        }
    }

    int l() {
        Context contextK;
        String[] strArrR = r();
        if (strArrR == null || strArrR.length <= 0) {
            return 0;
        }
        try {
            contextK = k();
        } catch (Exception unused) {
        }
        List listAsList = contextK != null ? Arrays.asList(contextK.getSharedPreferences("SdkCrashAnalytics", 0).getString("ConfirmedFilenames", "").split("\\|")) : null;
        if (listAsList == null) {
            return 1;
        }
        for (String str : strArrR) {
            if (!listAsList.contains(str)) {
                return 1;
            }
        }
        return 2;
    }

    boolean m() {
        Context contextK = k();
        return contextK != null && contextK.getSharedPreferences("SdkCrashAnalytics", 0).getInt("CrashAnalyticsVersion", 0) < 1;
    }

    void n() {
        k9.h.g("Checking CrashManager version.");
        Context contextK = k();
        if (contextK != null) {
            try {
                if (m()) {
                    k9.h.g("Found new CrashManager version. Migrating crash reports from previous version.");
                    if (o()) {
                        SharedPreferences.Editor editorEdit = contextK.getSharedPreferences("SdkCrashAnalytics", 0).edit();
                        editorEdit.putInt("CrashAnalyticsVersion", 1);
                        editorEdit.apply();
                    }
                } else {
                    k9.h.g("CrashManager version did not change.");
                }
            } catch (Exception e5) {
                k9.h.g("Exception occurred while doing MigrateCrashAnalyticsTask:\n" + e5.getMessage());
            }
        }
    }

    boolean o() {
        Context contextK = k();
        if (contextK == null) {
            k9.h.g("Migrating from previous version did not succeed. Context is null.");
            return false;
        }
        File fileA = g.a(contextK);
        if (fileA == null) {
            return false;
        }
        k9.h.g("Looking for crash reports in: " + fileA.getAbsolutePath());
        if (!fileA.exists()) {
            k9.h.g("No crash reports to migrate.");
            return true;
        }
        File[] fileArrListFiles = fileA.listFiles(new FilenameFilter() { // from class: ta.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return d.g(file, str);
            }
        });
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            k9.h.g("No crash reports to migrate.");
            return true;
        }
        for (File file : fileArrListFiles) {
            if (!file.isDirectory()) {
                file.delete();
            }
        }
        k9.h.g("Migrated successfully.");
        return true;
    }

    void p() {
        q();
        k9.h.g("Executing CrashManager");
        new a(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    void q() {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (defaultUncaughtExceptionHandler != null) {
            k9.h.g("Current handler class = " + defaultUncaughtExceptionHandler.getClass().getName());
        }
        Thread.setDefaultUncaughtExceptionHandler(new f(defaultUncaughtExceptionHandler, this.f27396a));
    }

    String[] r() {
        Context contextK = k();
        if (contextK == null) {
            return null;
        }
        File fileA = g.a(contextK);
        if (fileA == null) {
            k9.h.g("Can't search for exception as file path is null.");
            return null;
        }
        k9.h.g("Looking for exceptions in: " + fileA.getAbsolutePath());
        return (fileA.exists() || fileA.mkdir()) ? fileA.list(new FilenameFilter() { // from class: ta.b
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return d.j(file, str);
            }
        }) : new String[0];
    }
}
