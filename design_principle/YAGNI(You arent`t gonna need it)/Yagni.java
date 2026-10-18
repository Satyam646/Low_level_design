// actually this is a good example of YAGNI, because we don't need to implement the method yet, but we might in the future.

//if we don't implement the method now, we can always add it later when we actually need it. This way, we avoid adding unnecessary complexity to our codebase and keep it simple and maintainable.

//Suppose you are working on a project that involves uploading user profile pictures. Your current requirement is simple:

//Accept an image
//Resize it to 300x300
//Store it on the local filesystem
//Three steps. Straightforward. But then you start thinking ahead.

//What if we need video uploads later? Better add a media handler interface. 
//What if we switch to cloud storage? Better add a storage provider abstraction. 
//What if users want 3D avatars? Better make the system extensible. 
//What if other teams want to plug in their own handlers? Better build a plugin system.
//So instead of writing a simple image uploader, you build something like this:
// Interface for handling different media types
interface IMediaHandler {
    boolean canHandle(String fileType);
    File process(File file);
}

// Interface for storage providers
interface IStorageProvider {
    void store(File file, String path);
    File retrieve(String path);
    void delete(String path);
}

// Factory for creating media handlers
class MediaHandlerFactory {
    private final Map<String, IMediaHandler> handlers = new HashMap<>();

    public void register(String type, IMediaHandler handler) {
        handlers.put(type, handler);
    }

    public IMediaHandler getHandler(String fileType) {
        IMediaHandler handler = handlers.get(fileType);
        if (handler == null) {
            throw new UnsupportedOperationException(
                "No handler for type: " + fileType
            );
        }
        return handler;
    }
}

// Cloud storage adapter (not needed yet)
class CloudStorageAdapter implements IStorageProvider {
    private final String bucketName;
    private final String region;

    public CloudStorageAdapter(String bucketName, String region) {
        this.bucketName = bucketName;
        this.region = region;
    }

    public void store(File file, String path) {
        // Cloud upload logic - not implemented, not needed
    }

    public File retrieve(String path) {
        // Cloud download logic - not implemented, not needed
        return null;
    }

    public void delete(String path) {
        // Cloud delete logic - not implemented, not needed
    }
}

// Image handler (the only one actually needed)
class ImageMediaHandler implements IMediaHandler {
    public boolean canHandle(String fileType) {
        return fileType.equals("image");
    }

    public File process(File file) {
        // Resize logic
        return resize(file, 300, 300);
    }

    private File resize(File file, int width, int height) {
        // actual resize implementation
        return file;
    }
}

// The bloated engine that ties it all together
class MediaProcessingEngine {
    private final MediaHandlerFactory handlerFactory;
    private final IStorageProvider storageProvider;

    public MediaProcessingEngine(
            MediaHandlerFactory handlerFactory,
            IStorageProvider storageProvider) {
        this.handlerFactory = handlerFactory;
        this.storageProvider = storageProvider;
    }

    public void upload(File file, String fileType, String path) {
        IMediaHandler handler = handlerFactory.getHandler(fileType);
        File processed = handler.process(file);
        storageProvider.store(processed, path);
    }
}

//The simpler version yagni applied

class ImageUploader {
    private final ImageResizer resizer;
    private final LocalStorage storage;

    public ImageUploader(ImageResizer resizer, LocalStorage storage) {
        this.resizer = resizer;
        this.storage = storage;
    }

    public void upload(File imageFile) {
        File resized = resizer.resize(imageFile, 300, 300);
        storage.save(resized);
    }
}