package o9;

import a9.i;
import androidx.core.util.d;
import f8.a;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import k9.h;
import z7.e;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: b, reason: collision with root package name */
    private final s9.c f25818b;

    /* renamed from: a, reason: collision with root package name */
    private final Object f25817a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final b f25819c = new b();

    /* renamed from: d, reason: collision with root package name */
    private final Set f25820d = new ConcurrentSkipListSet();

    public c(s9.c cVar) {
        this.f25818b = cVar;
    }

    private void b(String str) {
        File fileD = this.f25818b.d(str);
        if (fileD == null || !fileD.exists()) {
            return;
        }
        e.d(fileD);
    }

    private boolean c(q9.b bVar) throws Throwable {
        StringBuilder sb2;
        String str;
        b(bVar.l());
        File fileE = e(bVar);
        if (fileE == null) {
            sb2 = new StringBuilder();
            str = "Failed to download ";
        } else if (!d(bVar, fileE)) {
            sb2 = new StringBuilder();
            str = "File is not valid ";
        } else {
            if (f(bVar, fileE) != null) {
                return true;
            }
            sb2 = new StringBuilder();
            str = "Failed to deploy ";
        }
        sb2.append(str);
        sb2.append(bVar.s());
        h.l("[InApp]InAppDownloader", sb2.toString());
        return false;
    }

    private boolean d(q9.b bVar, File file) {
        if (this.f25819c.a(new d(file, bVar))) {
            return true;
        }
        file.delete();
        return false;
    }

    private File e(q9.b bVar) throws Throwable {
        h.v("[InApp]InAppDownloader", "Start download: " + bVar.l());
        i.e(new f8.a(a.EnumC0130a.DOWNLOADING_ZIP, bVar));
        File fileA = this.f25818b.a();
        if (fileA == null) {
            return null;
        }
        File fileB = e.b(bVar.s(), new File(fileA, bVar.l() + ".zip"));
        if (fileB == null) {
            return null;
        }
        i.e(new f8.a(a.EnumC0130a.DOWNLOADED_ZIP, bVar));
        return fileB;
    }

    private File f(q9.b bVar, File file) {
        file.deleteOnExit();
        h.v("[InApp]InAppDownloader", "Start deploy:" + bVar.l());
        return e.a(file, this.f25818b.d(bVar.l()));
    }

    public a a(List list) {
        a aVar;
        f8.a aVar2;
        if (list == null || list.isEmpty()) {
            return a.a();
        }
        ArrayList<q9.b> arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.f25820d.addAll(arrayList);
        synchronized (this.f25817a) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            ArrayList arrayList3 = new ArrayList();
            for (q9.b bVar : arrayList) {
                if (c(bVar)) {
                    arrayList2.add(bVar);
                    h.s("[InApp]InAppDownloader", bVar.l() + " deployed");
                    aVar2 = new f8.a(a.EnumC0130a.DEPLOYED, bVar);
                } else {
                    arrayList3.add(bVar);
                    aVar2 = new f8.a(a.EnumC0130a.DEPLOY_FAILED, bVar);
                }
                i.e(aVar2);
                this.f25820d.remove(bVar);
            }
            aVar = new a(arrayList2, arrayList3);
        }
        return aVar;
    }

    public void g(String str) {
        synchronized (this.f25817a) {
            b(str);
        }
    }

    public boolean h(q9.b bVar) {
        return this.f25820d.contains(bVar);
    }
}
