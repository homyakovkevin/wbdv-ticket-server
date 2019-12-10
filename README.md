# API Documentation

### Users

GET /api/users/{username}

DELETE /api/users/{username}

POST /api/users
body:
    {
        "username": "george@gmail.com",
        "password": "12345",
        "firstName": "George",
        "lastName": "Khomchenko",
        "type": "admin"
    }

GET /api/users

PUT /api/users/{username}

POST /api/users/{username}/events/{eId}

#### Important: Both user and event have to be posted before (for event post see below)

DELETE /api/users/{username}/events/{eId}

GET /api/users/{username}/event

### Event Reviews

GET /api/events/{eventId}/reviews

### User's Reviews

POST /api/users/{username}/reviews/{eventId}
body:
{
review: "Great event!"
}

DELETE /api/users/{username}/reviews/{reviewId}

PUT /api/users/{username}/reviews/{reviewId}
body:
{
review: "Bad event!"
}

GET /api/users/{username}/reviews/?eventId=1235542 -----> Optional!

### Events

POST /api/events
body:
{
    "id": 104395821,
    "status": "Active",
    "locale": "en_US",
    "name": "Hayley Kiyoko",
    "description": "Hayley Kiyoko House of Blues Boston Tickets - Buy and sell Hayley Kiyoko Boston Tickets
    for February 17 at House of Blues Boston in Boston, MA on StubHub!",
    "webURI": "hayley-kiyoko-tickets-hayley-kiyoko-boston-house-of-blues-boston-2-17-2020/event/104395821/",
    "eventDateLocal": "2020-02-17T20:00:00-0500",
    "eventDateUTC": "2020-02-18T01:00:00+0000",
    "createdDate": "2019-10-15T14:28:37+0000",
    "lastUpdatedDate": "2019-10-15T14:45:08+0000",
    "venue": {
      "id": 2101,
      "name": "House of Blues Boston",
      "city": "Boston",
      "state": "MA",
      "postalCode": "02215",
      "country": "US"
    },
    "performers":"Hayley Kiyoko"
  }

GET /api/events

GET /api/events/{id}

DELETE /api/events/{id}

### Listings

POST /api/events/{eventId}/listings
body: 
{
      "listingId": 1585349488,
      "listingRow": "GA",
      "quantity": 1,
      "sellerSectionName": "General Admission",
      "sectionName": "General Admission",
      "isGA": 1,
      "price": 58.98,
      "currency": "USD"
}

GET /api/events/{eventId}/listings

GET /api/events/{eventId}/listings/{id}

DELETE /api/events/{eventId}/listings/{id}



