RELATIONSHIP

Insert the following documents into a users collection

db.users.insert([
	{
		username : "GoodGuyGreg",
		first_name : "Good Guy",
		last_name : "Greg"
	},
	{
		username : "ScumbagSteve",
		full_name : {
			first : "Scumbag",
			last : "Steve",
		}
	}
])

Insert the following documents into a posts collection

db.posts.insert([
	{
		_id: 1,
		username : "GoodGuyGreg",
		title : "Passes out at party",
		body : "Wakes up early and cleans house",
	},

	{
		_id: 2,
		username : "GoodGuyGreg",
		title : "Steals your identity",
		body : "Raises your credit score",
	},

	{
		_id: 3,
		username : "GoodGuyGreg",
		title : "Reports a bug in your code",
		body : "Sends you a Pull Request",
	},

	{
		_id: 4,
		username : "ScumbagSteve",
		title : "Borrows something",
		body : "Sells it",
	},

	{
		_id: 5,
		username : "ScumbagSteve",
		title : "Borrows everything",
		body : "The end",
	},

	{
		_id: 6,
		username : "ScumbagSteve",
		title : "Forks your repo on github",
		body : "Sets to private",
	},
])

Insert the following documents into a comments collection

db.comments.insert([
	{
		username : "GoodGuyGreg",
		comment : "Hope you got a good deal!",
		post : 4,
	},
	{
		username : "GoodGuyGreg",
		comment : "What's mine is yours!",
		post : 5,
	},
	{
		username : "GoodGuyGreg",
		comment : "Don't violate the licensing agreement!",
		post : 6,
	},
	{
		username : "ScumbagSteve",
		comment : "It still isn't clean",
		post : 1,
	},
	{
		username : "ScumbagSteve",
		comment : "Denied your PR cause I found a hack",
		post : 3
	},
])
