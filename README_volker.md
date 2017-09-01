# cURL calls

* Post new Bookmark

```bash
$> curl -H "Content-Type: application/json" -X POST -d '{"title":"a1b2c3","url":"1x2y3z"}' http://localhost:11111/bookmarks/addBookmarkPost
```

* Add new MediaItem

```bash
curl -H "Content-Type: application/json" -X POST -d '{"title":"Der Test","isbn13":"0123456789123"}' http://localhost:11111/mediaItems/add
```
## Derby
* [application.properties](https://github.com/springframeworkguru/spring-boot-apache-derby-example/blob/master/src/main/resources/application.properties)
* [Derby Dev Guide](https://db.apache.org/derby/docs/10.4/devguide/cdevdvlp40653.html)

