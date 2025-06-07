package o0;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* loaded from: classes.dex */
final class c implements Closeable {

    /* renamed from: m, reason: collision with root package name */
    private final File f25687m;

    /* renamed from: n, reason: collision with root package name */
    private final long f25688n;

    /* renamed from: o, reason: collision with root package name */
    private final File f25689o;

    /* renamed from: p, reason: collision with root package name */
    private final RandomAccessFile f25690p;

    /* renamed from: q, reason: collision with root package name */
    private final FileChannel f25691q;

    /* renamed from: r, reason: collision with root package name */
    private final FileLock f25692r;

    class a implements FileFilter {
        a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals("MultiDex.lock");
        }
    }

    private static class b extends File {

        /* renamed from: m, reason: collision with root package name */
        public long f25694m;

        public b(File file, String str) {
            super(file, str);
            this.f25694m = -1L;
        }
    }

    c(File file, File file2) throws Throwable {
        Log.i("MultiDex", "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")");
        this.f25687m = file;
        this.f25689o = file2;
        this.f25688n = s(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f25690p = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f25691q = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f25692r = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e5) {
                e = e5;
                c(this.f25691q);
                throw e;
            } catch (Error e10) {
                e = e10;
                c(this.f25691q);
                throw e;
            } catch (RuntimeException e11) {
                e = e11;
                c(this.f25691q);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e12) {
            c(this.f25690p);
            throw e12;
        }
    }

    private List U(Context context, String str) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.f25687m.getName() + ".classes";
        SharedPreferences sharedPreferencesF = f(context);
        int i10 = sharedPreferencesF.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i10 + (-1));
        int i11 = 2;
        while (i11 <= i10) {
            b bVar = new b(this.f25689o, str2 + i11 + ".zip");
            if (!bVar.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + bVar.getPath() + "'");
            }
            bVar.f25694m = s(bVar);
            long j10 = sharedPreferencesF.getLong(str + "dex.crc." + i11, -1L);
            long j11 = sharedPreferencesF.getLong(str + "dex.time." + i11, -1L);
            long jLastModified = bVar.lastModified();
            if (j11 == jLastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences = sharedPreferencesF;
                if (j10 == bVar.f25694m) {
                    arrayList.add(bVar);
                    i11++;
                    sharedPreferencesF = sharedPreferences;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str + "\"), expected modification time: " + j11 + ", modification time: " + jLastModified + ", expected crc: " + j10 + ", file crc: " + bVar.f25694m);
        }
        return arrayList;
    }

    private List V() throws IOException {
        boolean z10;
        String str = this.f25687m.getName() + ".classes";
        a();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f25687m);
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            int i10 = 2;
            while (entry != null) {
                b bVar = new b(this.f25689o, str + i10 + ".zip");
                arrayList.add(bVar);
                Log.i("MultiDex", "Extraction is needed for file " + bVar);
                int i11 = 0;
                boolean z11 = false;
                while (i11 < 3 && !z11) {
                    int i12 = i11 + 1;
                    e(zipFile, entry, bVar, str);
                    try {
                        bVar.f25694m = s(bVar);
                        z10 = true;
                    } catch (IOException e5) {
                        Log.w("MultiDex", "Failed to read crc from " + bVar.getAbsolutePath(), e5);
                        z10 = false;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Extraction ");
                    sb2.append(z10 ? "succeeded" : "failed");
                    sb2.append(" '");
                    sb2.append(bVar.getAbsolutePath());
                    sb2.append("': length ");
                    sb2.append(bVar.length());
                    sb2.append(" - crc: ");
                    sb2.append(bVar.f25694m);
                    Log.i("MultiDex", sb2.toString());
                    if (!z10) {
                        bVar.delete();
                        if (bVar.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + bVar.getPath() + "'");
                        }
                    }
                    z11 = z10;
                    i11 = i12;
                }
                if (!z11) {
                    throw new IOException("Could not create zip file " + bVar.getAbsolutePath() + " for secondary dex (" + i10 + ")");
                }
                i10++;
                entry = zipFile.getEntry("classes" + i10 + ".dex");
            }
            try {
                zipFile.close();
            } catch (IOException e10) {
                Log.w("MultiDex", "Failed to close resource", e10);
            }
            return arrayList;
        } finally {
        }
    }

    private static void W(Context context, String str, long j10, long j11, List list) {
        SharedPreferences.Editor editorEdit = f(context).edit();
        editorEdit.putLong(str + "timestamp", j10);
        editorEdit.putLong(str + "crc", j11);
        editorEdit.putInt(str + "dex.number", list.size() + 1);
        Iterator it = list.iterator();
        int i10 = 2;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            editorEdit.putLong(str + "dex.crc." + i10, bVar.f25694m);
            editorEdit.putLong(str + "dex.time." + i10, bVar.lastModified());
            i10++;
        }
        editorEdit.commit();
    }

    private void a() {
        File[] fileArrListFiles = this.f25689o.listFiles(new a());
        if (fileArrListFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + this.f25689o.getPath() + ").");
            return;
        }
        for (File file : fileArrListFiles) {
            Log.i("MultiDex", "Trying to delete old file " + file.getPath() + " of size " + file.length());
            if (file.delete()) {
                Log.i("MultiDex", "Deleted old file " + file.getPath());
            } else {
                Log.w("MultiDex", "Failed to delete old file " + file.getPath());
            }
        }
    }

    private static void c(Closeable closeable) throws IOException {
        try {
            closeable.close();
        } catch (IOException e5) {
            Log.w("MultiDex", "Failed to close resource", e5);
        }
    }

    private static void e(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile("tmp-" + str, ".zip", file.getParentFile());
        Log.i("MultiDex", "Extracting " + fileCreateTempFile.getPath());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 == -1) {
                        break;
                    } else {
                        zipOutputStream.write(bArr, 0, i10);
                    }
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (fileCreateTempFile.renameTo(file)) {
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } finally {
            c(inputStream);
            fileCreateTempFile.delete();
        }
    }

    private static SharedPreferences f(Context context) {
        return context.getSharedPreferences("multidex.version", 4);
    }

    private static long g(File file) {
        long jLastModified = file.lastModified();
        return jLastModified == -1 ? jLastModified - 1 : jLastModified;
    }

    private static long s(File file) throws IOException {
        long jC = d.c(file);
        return jC == -1 ? jC - 1 : jC;
    }

    private static boolean x(Context context, File file, long j10, String str) {
        SharedPreferences sharedPreferencesF = f(context);
        if (sharedPreferencesF.getLong(str + "timestamp", -1L) == g(file)) {
            if (sharedPreferencesF.getLong(str + "crc", -1L) == j10) {
                return false;
            }
        }
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f25692r.release();
        this.f25691q.close();
        this.f25690p.close();
    }

    List y(Context context, String str, boolean z10) throws IOException {
        List listU;
        Log.i("MultiDex", "MultiDexExtractor.load(" + this.f25687m.getPath() + ", " + z10 + ", " + str + ")");
        if (!this.f25692r.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z10 && !x(context, this.f25687m, this.f25688n, str)) {
            try {
                listU = U(context, str);
            } catch (IOException e5) {
                Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e5);
            }
            Log.i("MultiDex", "load found " + listU.size() + " secondary dex files");
            return listU;
        }
        Log.i("MultiDex", z10 ? "Forced extraction must be performed." : "Detected that extraction must be performed.");
        List listV = V();
        W(context, str, g(this.f25687m), this.f25688n, listV);
        listU = listV;
        Log.i("MultiDex", "load found " + listU.size() + " secondary dex files");
        return listU;
    }
}
