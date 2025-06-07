package androidx.media;

import androidx.versionedparcelable.a;

/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f3194a = aVar.p(audioAttributesImplBase.f3194a, 1);
        audioAttributesImplBase.f3195b = aVar.p(audioAttributesImplBase.f3195b, 2);
        audioAttributesImplBase.f3196c = aVar.p(audioAttributesImplBase.f3196c, 3);
        audioAttributesImplBase.f3197d = aVar.p(audioAttributesImplBase.f3197d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        aVar.x(false, false);
        aVar.F(audioAttributesImplBase.f3194a, 1);
        aVar.F(audioAttributesImplBase.f3195b, 2);
        aVar.F(audioAttributesImplBase.f3196c, 3);
        aVar.F(audioAttributesImplBase.f3197d, 4);
    }
}
