package s1;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.data.g;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class c implements com.bumptech.glide.load.data.d {

    /* renamed from: m, reason: collision with root package name */
    private final Uri f26722m;

    /* renamed from: n, reason: collision with root package name */
    private final e f26723n;

    /* renamed from: o, reason: collision with root package name */
    private InputStream f26724o;

    static class a implements d {

        /* renamed from: b, reason: collision with root package name */
        private static final String[] f26725b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f26726a;

        a(ContentResolver contentResolver) {
            this.f26726a = contentResolver;
        }

        @Override // s1.d
        public Cursor a(Uri uri) {
            return this.f26726a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f26725b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    static class b implements d {

        /* renamed from: b, reason: collision with root package name */
        private static final String[] f26727b = {"_data"};

        /* renamed from: a, reason: collision with root package name */
        private final ContentResolver f26728a;

        b(ContentResolver contentResolver) {
            this.f26728a = contentResolver;
        }

        @Override // s1.d
        public Cursor a(Uri uri) {
            return this.f26728a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f26727b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
        }
    }

    c(Uri uri, e eVar) {
        this.f26722m = uri;
        this.f26723n = eVar;
    }

    private static c c(Context context, Uri uri, d dVar) {
        return new c(uri, new e(com.bumptech.glide.b.c(context).j().g(), dVar, com.bumptech.glide.b.c(context).e(), context.getContentResolver()));
    }

    public static c d(Context context, Uri uri) {
        return c(context, uri, new a(context.getContentResolver()));
    }

    public static c g(Context context, Uri uri) {
        return c(context, uri, new b(context.getContentResolver()));
    }

    private InputStream h() throws Throwable {
        InputStream inputStreamD = this.f26723n.d(this.f26722m);
        int iA = inputStreamD != null ? this.f26723n.a(this.f26722m) : -1;
        return iA != -1 ? new g(inputStreamD, iA) : inputStreamD;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() throws IOException {
        InputStream inputStream = this.f26724o;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }

    @Override // com.bumptech.glide.load.data.d
    public r1.a e() {
        return r1.a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void f(com.bumptech.glide.g gVar, d.a aVar) throws Throwable {
        try {
            InputStream inputStreamH = h();
            this.f26724o = inputStreamH;
            aVar.d(inputStreamH);
        } catch (FileNotFoundException e5) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e5);
            }
            aVar.c(e5);
        }
    }
}
