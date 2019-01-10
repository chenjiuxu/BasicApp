
如何引入项目：
将其添加到存储库末尾的根build.gradle中：
allprojects {
	repositories {
		maven { url 'https://jitpack.io' }
		}
	}
添加依赖项：
implementation 'com.github.chenjiuxu:BasicApp:x.x.x'
