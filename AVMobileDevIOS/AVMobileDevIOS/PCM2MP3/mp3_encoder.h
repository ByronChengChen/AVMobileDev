#ifndef PHUKET_TOUR_MP3_ENCODER
#define PHUKET_TOUR_MP3_ENCODER

#include "lame.h"

/**
 * 视频编码
 */
class Mp3Encoder {
private:
	FILE* pcmFile;
	FILE* mp3File;
	lame_t lameClient;

public:
	Mp3Encoder(const char* pcmFilePath, const char *mp3FilePath, int sampleRate, int channels, int bitRate);
    Mp3Encoder();
	~Mp3Encoder();

	int Init(const char* pcmFilePath, const char *mp3FilePath, int sampleRate, int channels, int bitRate);
	void Encode();
	void Destory();
};

#endif //PHUKET_TOUR_MP3_ENCODER
