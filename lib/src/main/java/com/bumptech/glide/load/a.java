package com.bumptech.glide.load;

import a2.w;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: com.bumptech.glide.load.a$a, reason: collision with other inner class name */
    class C0090a implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f5414a;

        C0090a(InputStream inputStream) {
            this.f5414a = inputStream;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.d(this.f5414a);
            } finally {
                this.f5414a.reset();
            }
        }
    }

    class b implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f5415a;

        b(ByteBuffer byteBuffer) {
            this.f5415a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) {
            return imageHeaderParser.a(this.f5415a);
        }
    }

    class c implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f5416a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u1.b f5417b;

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, u1.b bVar) {
            this.f5416a = parcelFileDescriptorRewinder;
            this.f5417b = bVar;
        }

        @Override // com.bumptech.glide.load.a.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws Throwable {
            w wVar;
            w wVar2 = null;
            try {
                wVar = new w(new FileInputStream(this.f5416a.a().getFileDescriptor()), this.f5417b);
            } catch (Throwable th) {
                th = th;
            }
            try {
                ImageHeaderParser.ImageType imageTypeD = imageHeaderParser.d(wVar);
                try {
                    wVar.close();
                } catch (IOException unused) {
                }
                this.f5416a.a();
                return imageTypeD;
            } catch (Throwable th2) {
                th = th2;
                wVar2 = wVar;
                if (wVar2 != null) {
                    try {
                        wVar2.close();
                    } catch (IOException unused2) {
                    }
                }
                this.f5416a.a();
                throw th;
            }
        }
    }

    class d implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f5418a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u1.b f5419b;

        d(ByteBuffer byteBuffer, u1.b bVar) {
            this.f5418a = byteBuffer;
            this.f5419b = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) {
            return imageHeaderParser.b(this.f5418a, this.f5419b);
        }
    }

    class e implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f5420a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u1.b f5421b;

        e(InputStream inputStream, u1.b bVar) {
            this.f5420a = inputStream;
            this.f5421b = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.c(this.f5420a, this.f5421b);
            } finally {
                this.f5420a.reset();
            }
        }
    }

    class f implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f5422a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ u1.b f5423b;

        f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, u1.b bVar) {
            this.f5422a = parcelFileDescriptorRewinder;
            this.f5423b = bVar;
        }

        @Override // com.bumptech.glide.load.a.g
        public int a(ImageHeaderParser imageHeaderParser) throws Throwable {
            w wVar;
            w wVar2 = null;
            try {
                wVar = new w(new FileInputStream(this.f5422a.a().getFileDescriptor()), this.f5423b);
            } catch (Throwable th) {
                th = th;
            }
            try {
                int iC = imageHeaderParser.c(wVar, this.f5423b);
                try {
                    wVar.close();
                } catch (IOException unused) {
                }
                this.f5422a.a();
                return iC;
            } catch (Throwable th2) {
                th = th2;
                wVar2 = wVar;
                if (wVar2 != null) {
                    try {
                        wVar2.close();
                    } catch (IOException unused2) {
                    }
                }
                this.f5422a.a();
                throw th;
            }
        }
    }

    private interface g {
        int a(ImageHeaderParser imageHeaderParser);
    }

    private interface h {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser);
    }

    public static int a(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, u1.b bVar) {
        return d(list, new f(parcelFileDescriptorRewinder, bVar));
    }

    public static int b(List list, InputStream inputStream, u1.b bVar) {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return d(list, new e(inputStream, bVar));
    }

    public static int c(List list, ByteBuffer byteBuffer, u1.b bVar) {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, bVar));
    }

    private static int d(List list, g gVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iA = gVar.a((ImageHeaderParser) list.get(i10));
            if (iA != -1) {
                return iA;
            }
        }
        return -1;
    }

    public static ImageHeaderParser.ImageType e(List list, ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, u1.b bVar) {
        return h(list, new c(parcelFileDescriptorRewinder, bVar));
    }

    public static ImageHeaderParser.ImageType f(List list, InputStream inputStream, u1.b bVar) {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new w(inputStream, bVar);
        }
        inputStream.mark(5242880);
        return h(list, new C0090a(inputStream));
    }

    public static ImageHeaderParser.ImageType g(List list, ByteBuffer byteBuffer) {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : h(list, new b(byteBuffer));
    }

    private static ImageHeaderParser.ImageType h(List list, h hVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ImageHeaderParser.ImageType imageTypeA = hVar.a((ImageHeaderParser) list.get(i10));
            if (imageTypeA != ImageHeaderParser.ImageType.UNKNOWN) {
                return imageTypeA;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
