//
//  test.m
//  AVMobileDevIOS
//
//  Created by chengkang on 3/14/22.
//

#import "test.h"
#import "CommonUtil.h"
#import "mp3_encoder.h"

@implementation test

+ (void)testPCM2MP3{
    NSLog(@"Start Encode...");
    const char* pcmFilePath = [[CommonUtil bundlePath:@"vocal.pcm"] cStringUsingEncoding:NSUTF8StringEncoding];
    const char *mp3FilePath = [[CommonUtil documentsPath:@"vocal.mp3"] cStringUsingEncoding:NSUTF8StringEncoding];
    int sampleRate = 44100;
    int channels = 2;
    int bitRate = 128 * 1024;
    Mp3Encoder* encoder = new Mp3Encoder(pcmFilePath,mp3FilePath,sampleRate,channels,bitRate);
//    Mp3Encoder* encoder = new Mp3Encoder();
//    encoder->Init(pcmFilePath, mp3FilePath, sampleRate, channels, bitRate);
    encoder->Encode();
    encoder->Destory();
    delete encoder;
    NSLog(@"Encode Success");
}

@end
