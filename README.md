# mt7612u
yocto/open-embedded recipe for kernel module for mt7612u 

I'll leave this here because it might help someone, but I haven't managed to configure this to work as an access point.  

add this to your image recipe:

IMAGE_INSTALL += " mt7612u "
