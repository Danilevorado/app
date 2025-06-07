package com.bumptech.glide.load;

import java.io.InputStream;
import java.nio.ByteBuffer;
import u1.b;

/* loaded from: classes.dex */
public interface ImageHeaderParser {

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        UNKNOWN(false);


        /* renamed from: m, reason: collision with root package name */
        private final boolean f5412m;

        ImageType(boolean z10) {
            this.f5412m = z10;
        }

        public boolean hasAlpha() {
            return this.f5412m;
        }

        public boolean isWebp() {
            int i10 = a.f5413a[ordinal()];
            return i10 == 1 || i10 == 2 || i10 == 3;
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5413a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f5413a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5413a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5413a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    ImageType a(ByteBuffer byteBuffer);

    int b(ByteBuffer byteBuffer, b bVar);

    int c(InputStream inputStream, b bVar);

    ImageType d(InputStream inputStream);
}
