import requests


def get_posts():
    url = "https://jsonplaceholder.typicode.com/posts"

    try:
        response = requests.get(url)

        if response.status_code == 200:
            posts = response.json()
            return posts
        else:
            print("Error:",response.status_code)
            return None
    except requests.exceptions.RequestException as e:
        print("Error",e)
        return None

posts = get_posts()

if posts:
    print("First Post title:",posts[0]['title'])
    print("Second Post title:",posts[0]['body'])
else:
    print("Failed to fetch posts from API")

