var mediaItemsVideoDVD = [
		{title:'Raumpatrouille Orion', type: 'Video-DVD', isbn: '4009750299920', language: 'de', author: '', owner: 'Volker'},
		{title:'i, Robot', title2: '', isbn: '400232027719', language: 'de', actors: ['Smith, Will'], releaseYear: '', owner: 'Volker', type: 'Movie'},
		  {title:'Das Leben des Brian', title2: '', isbn: '4030521353855', language: 'de', actors: ['Monty Pythons'], releaseYear: '', owner: 'Volker', type: 'Movie'},
		  {title:'Space Cowboys', title2: '', isbn: '7321923187221', language: 'de', actors: ['Eastwood, Client', 'Jones, Tommy Lee', 'Sutherland, Donald', 'Garner, James'], releaseYear: '2000', owner: 'Volker', type: 'Movie'},
		  
		  {title:'War Games', title2: '', isbn: '40045167004429', language: 'de', actors: ['Broderick, Matthew'], releaseYear: '1983', owner: 'Volker', type: 'Movie'},
		  {title:'Dragons', title2: 'Auf zu neuen Ufern', isbn: '4047552000696', language: 'de', actors: [''], releaseYear: '2015', owner: 'Sarah', type: 'Movie'},
		  {title:'Lauras Stern', title2: 'und die Traummonster', isbn: '5051890073662', language: 'de', actors: [''], releaseYear: '2012', owner: 'Sarah', type: 'Movie'},
		  {title:'Dark City', title2: '', isbn: '5051890076588', language: 'de', actors: [''], releaseYear: '1998', owner: 'Volker', type: 'Movie'},
		   {title:'Das Boot', title2: 'The Directors Cut', director: 'Petersen, Wolfgang', isbn: '4009750282229', language: 'de', actors: ['Prochnow, Jürgen', 'Grönemeyer, Herbert', 'Wennemann, Klaus', 'Fedder, Jan', 'Hönig, Heinz'], releaseYear: '2015', owner: 'Sarah', type: 'Movie'},
		{title:'Der dunkle Kristall', title2: 'Die Reise in Labyrinth', isbn: '4030521713604', language: 'de', actors: [''], releaseYear: '1998', owner: 'Andrea', type: 'Movie'},
		{title:'CSI', title2: 'Crime Scene Investigation', isbn: '886970909594', language: 'de', actors: [''], releaseYear: '1998', owner: 'Andrea', type: 'DVD-Box', season: '7'},
		
		
		{title:'Bibi Blocksberg als Prinzessin', title2: 'Best of', isbn: '', language: 'de', actors: [''], releaseYear: '1998', owner: 'Sarah', type: 'Movie'},
		{title:'Bibi Blocksberg - Wo ist Katoffelbrei?', title2: 'Best of', isbn: '', language: 'de', actors: [''], releaseYear: '1998', owner: 'Sarah', type: 'Movie'},
		{title:'Bibi Blocksberg - Das verhexte Dromedar', title2: '', isbn: '', language: 'de', actors: [''], releaseYear: '1998', owner: 'Sarah', type: 'Movie'},
		{title:'Bibi Blocksberg - Die Schlossgespenster', title2: '', isbn: '', language: 'de', actors: [''], releaseYear: '1998', owner: 'Sarah', type: 'Movie'},
		{title:'Hanni & Nanni', title2: '', isbn: '', language: 'de', actors: [''], releaseYear: '1998', owner: 'Sarah', type: 'Movie'},
		{title:'Alien', title2: 'Anthology', isbn: '', language: 'de', actors: [''], releaseYear: '1998', owner: 'Volker', type: 'Movie'},
		{title:'Die Maus auf dem Mars', title2: '', isbn: '', language: 'de', actors: [''], releaseYear: '1998', owner: 'Andrea & Volker', type: 'Movie'},
		{title:'Als di Frauen noch Schwänze hatten', title2: '', isbn: '4260057815002', language: 'de', actors: [''], releaseYear: '1998', owner: 'Volker', type: 'Movie'},
		
		{title:'Pan Tau', title2: 'DVD 1', isbn: '', language: 'de', actors: [''], releaseYear: '1998', owner: 'Andrea & Volker', type: 'Movie'},
		{title:'Pan Tau', title2: '', isbn: '', language: 'de', actors: [''], releaseYear: '1998', owner: 'Andrea & Volker', type: 'Movie'},
		{title:'Drei Nüse für Aschenbrödel', title2: 'Die Welt der Märchen', isbn: '', language: 'de', actors: [''], releaseYear: '1998', owner: 'Andrea', type: 'Movie'},
		{title:'Greay Anathomy', title2: 'Box 1', isbn: '', language: 'de', actors: [''], releaseYear: '1998', owner: 'Andrea', type: 'Movie'},
		{title:'Greay Anathomy', title2: 'Box 2', isbn: '', language: 'de', actors: [''], releaseYear: '1998', owner: 'Andrea', type: 'Movie'},
		{title:'Greay Anathomy', title2: 'Box 3', isbn: '', language: 'de', actors: [''], releaseYear: '1998', owner: 'Andrea', type: 'Movie'},
		{title:'Greay Anathomy', title2: 'Box 4', isbn: '', language: 'de', actors: [''], releaseYear: '1998', owner: 'Andrea', type: 'Movie'},
		{title:'Greay Anathomy', title2: 'Box 5', isbn: '', language: 'de', actors: [''], releaseYear: '1998', owner: 'Andrea', type: 'Movie'},
		
	];

importVideoDVD = function(){
for (i=0; i<mediaItemsVideoDVD.length; i++){
		var item = mediaItemsVideoDVD[i];
		
		
		if (item.type == undefined){
			item.type = 'VideoDVD';
		}
		
		if (!isItemPresent(item)){
			console.log('processing mediaItemsVideoDVD: ' + JSON.stringify(item));
			MediaItems.insert(item);
		}
	}
};