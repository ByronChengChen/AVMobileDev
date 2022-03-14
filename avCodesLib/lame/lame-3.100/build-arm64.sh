./configure \
--disable-shared \
--disable-frontend \
--host=arm-apple-darwin \
--prefix="/Users/chengkang/ffmpeg/AVMobileDev/avCodes/lame/thin/arm64" \
CC="xcrun -sdk iphoneos clang -arch arm64" \
CFLAGS="-arch arm64 -fembed-bitcode -miphoneos-version-min=7.0" \
LDFLAGS="-arch arm64 -fembed-bitcode -miphoneos-version-min=7.0"
make clean
make -j8
make install